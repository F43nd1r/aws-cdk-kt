package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupVault
import software.amazon.awscdk.services.backup.CfnBackupVaultProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBackupVault(id: String, props: CfnBackupVaultProps): CfnBackupVault =
    CfnBackupVault(this, id, props)

@Generated
public fun Construct.cfnBackupVault(
  id: String,
  props: CfnBackupVaultProps,
  initializer: @AwsCdkDsl CfnBackupVault.() -> Unit,
): CfnBackupVault = CfnBackupVault(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBackupVault(id: String, initializer: @AwsCdkDsl
    CfnBackupVault.Builder.() -> Unit): CfnBackupVault = CfnBackupVault.Builder.create(this,
    id).apply(initializer).build()
