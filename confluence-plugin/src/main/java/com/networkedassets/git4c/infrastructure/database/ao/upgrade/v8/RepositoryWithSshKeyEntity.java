package com.networkedassets.git4c.infrastructure.database.ao.upgrade.v8;

import net.java.ao.Preload;
import net.java.ao.schema.StringLength;
import net.java.ao.schema.Table;

@Table("SSHAuth")
@Preload
public interface RepositoryWithSshKeyEntity extends RepositoryEntity {

    @StringLength(value = StringLength.UNLIMITED)
    String getKey();

    @StringLength(value = StringLength.UNLIMITED)
    void setKey(String key);
}
