@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupVault
import software.amazon.awscdk.services.backup.BackupVaultProps
import software.constructs.Construct

public fun Construct.backupVault(id: String, initializer: BackupVault.() -> Unit = {}): BackupVault
    = BackupVault(this, id).apply(initializer)

public fun Construct.backupVault(
  id: String,
  props: BackupVaultProps,
  initializer: BackupVault.() -> Unit = {},
): BackupVault = BackupVault(this, id, props).apply(initializer)
