create index IX_DDD89E99 on BAR_Bar (field2);
create index IX_E21B0861 on BAR_Bar (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_21DC3323 on BAR_Bar (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_68E7FA0C on FOO_Bar (field2);
create index IX_54B0F014 on FOO_Bar (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1C1E6B96 on FOO_Bar (uuid_[$COLUMN_LENGTH:75$], groupId);