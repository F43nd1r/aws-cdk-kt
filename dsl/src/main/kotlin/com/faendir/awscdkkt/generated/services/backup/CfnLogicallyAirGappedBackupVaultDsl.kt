package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault
import software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVaultProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLogicallyAirGappedBackupVault(
  id: String,
  props: CfnLogicallyAirGappedBackupVaultProps,
  initializer: @AwsCdkDsl CfnLogicallyAirGappedBackupVault.() -> Unit = {},
): CfnLogicallyAirGappedBackupVault = CfnLogicallyAirGappedBackupVault(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLogicallyAirGappedBackupVault(id: String, initializer: @AwsCdkDsl CfnLogicallyAirGappedBackupVault.Builder.() -> Unit = {}): CfnLogicallyAirGappedBackupVault = CfnLogicallyAirGappedBackupVault.Builder.create(this, id).apply(initializer).build()
