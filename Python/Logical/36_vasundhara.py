detections = [
    {"frame": 1, "id": 101, "plate": "GJ01AB1234"},
    {"frame": 2, "id": 101, "plate": "GJ01AB1234"},
    {"frame": 3, "id": 102, "plate": "GJ05XY5678"},
    {"frame": 4, "id": 101, "plate": "GJ01AB1234"},
    {"frame": 5, "id": 102, "plate": "GJ05XY5678"},
    {"frame": 6, "id": 103, "plate": "GJ01AB1234"},
]

# Write a Python function that generates a unique vehicle entry record from these detections.

# 1.Group detections by id.
unique_vechicles = {}
for dict in detections:
        vechicle_id = dict['id']
        if vechicle_id not in unique_vechicles:
            unique_vechicles[vechicle_id] = {
                  'id' : dict['id'] , 
                  'plate' : dict['plate'] , 
                  'total_detection' : 0
            }

        else:
              unique_vechicles[vechicle_id]['total_detection']+=1

print('========== Unique Values ==========\n')
for key in unique_vechicles.values():
    print(key['id'] , key['plate'])


# 2.Determine the most frequently detected plate for each ID.
print('========== Most Detected Vechicle ==========\n')

most_detect = max(unique_vechicles.values() , key = lambda x : x['total_detection'])
print(most_detect)

# 3.Count how many frames each vehicle was detected.
print('========== Frames Each vechicle detectes ==========\n')
for key in unique_vechicles.values():
      print(key['id'] , key['total_detection'])
