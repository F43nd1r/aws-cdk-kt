package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupVault
import software.amazon.awscdk.services.backup.BackupVaultProps
import software.constructs.Construct

@Generated
public fun Construct.backupVault(id: String, initializer: @AwsCdkDsl BackupVault.() -> Unit = {}):
    BackupVault = BackupVault(this, id).apply(initializer)

@Generated
public fun Construct.backupVault(
  id: String,
  props: BackupVaultProps,
  initializer: @AwsCdkDsl BackupVault.() -> Unit = {},
): BackupVault = BackupVault(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBackupVault(id: String, initializer: @AwsCdkDsl
    BackupVault.Builder.() -> Unit = {}): BackupVault = BackupVault.Builder.create(this,
    id).apply(initializer).build()
