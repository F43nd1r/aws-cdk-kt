@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupVault
import software.amazon.awscdk.services.backup.CfnBackupVaultProps
import software.constructs.Construct

public fun Construct.cfnBackupVault(
  id: String,
  props: CfnBackupVaultProps,
  initializer: CfnBackupVault.() -> Unit = {},
): CfnBackupVault = CfnBackupVault(this, id, props).apply(initializer)
