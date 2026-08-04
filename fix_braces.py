import re

with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'r') as f:
    lines = f.readlines()

# TodayOverviewCard extra brace
# Let's find DonutChart and delete the brace above it if it's extra.
# Actually I'll use a stack to format and find unbalanced braces.
