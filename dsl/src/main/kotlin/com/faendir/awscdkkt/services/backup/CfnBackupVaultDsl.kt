package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupVault
import software.amazon.awscdk.services.backup.CfnBackupVaultProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBackupVault(
  id: String,
  props: CfnBackupVaultProps,
  initializer: CfnBackupVault.() -> Unit = {},
): CfnBackupVault = CfnBackupVault(this, id, props).apply(initializer)
