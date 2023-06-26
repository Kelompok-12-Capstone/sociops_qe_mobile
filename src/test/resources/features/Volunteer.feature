# Feature: Volunteer
#     As a user
#     I want to access Volunteer
#     So that i can join the activity

#     Scenario Outline: View detail of volunteers
#         Given I am on the home screen
#         And I click volunteer button home
#         When I click daftar button from the campaign
#         Then I will see detail of the volunteer
        
#     Scenario Outline: View details of actions to take when join volunteer
#         Given I am on the home screen
#         And I click volunteer button home
#         And I click daftar button from the campaign
#         When I click lihat selengkapnya tindakan button
#         Then I will see details of action to take when join volunteer

#     Scenario Outline: Apply volunteer
#         Given I am on the home screen
#         And I click volunteer button home
#         And I click daftar button from the campaign
#         And I click Ambil Aksi button
#         When I add link of the post
#         And I click simpan button ambil aksi
#         Then I will get success notification

#     Scenario Outline: Apply volunteer without upload proof of post
#         Given I am on the home screen
#         And I click volunteer button home
#         And I click daftar button from the campaign
#         And I click Ambil Aksi button
#         When I click simpan button ambil aksi
#         Then I will get failed notification

#     Scenario Outline: Return to homepage after apply volunteer
#         Given I am on the home screen
#         And I click volunteer button home
#         And I click daftar button from the campaign
#         And I click Ambil Aksi button
#         When I add link of the post
#         And I click simpan button ambil aksi
#         And I click Kembali ke beranda
#         Then I will go to the home screen