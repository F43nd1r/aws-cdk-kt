package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupResource
import software.amazon.awscdk.services.backup.TagCondition
import software.constructs.Construct

@Generated
public fun Construct.backupResource(resource: String, tagCondition: TagCondition): BackupResource =
    BackupResource(resource, tagCondition, this)

@Generated
public fun backupResource(resource: String): BackupResource = BackupResource(resource)

@Generated
public fun backupResource(): BackupResource = BackupResource()

@Generated
public fun backupResource(resource: String, tagCondition: TagCondition): BackupResource =
    BackupResource(resource, tagCondition)

@Generated
public fun Construct.buildBackupResource(resource: String, initializer: @AwsCdkDsl
    BackupResource.Builder.() -> Unit): BackupResource = BackupResource.Builder.create(resource,
    this).apply(initializer).build()

@Generated
public fun buildBackupResource(resource: String, initializer: @AwsCdkDsl
    BackupResource.Builder.() -> Unit): BackupResource =
    BackupResource.Builder.create(resource).apply(initializer).build()

@Generated
public fun buildBackupResource(initializer: @AwsCdkDsl BackupResource.Builder.() -> Unit):
    BackupResource = BackupResource.Builder.create().apply(initializer).build()
