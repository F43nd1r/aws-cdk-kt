@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
