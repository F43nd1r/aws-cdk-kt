package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnTokenVault
import software.amazon.awscdk.services.bedrockagentcore.CfnTokenVaultProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTokenVault(id: String, initializer: @AwsCdkDsl CfnTokenVault.() -> Unit = {}): CfnTokenVault = CfnTokenVault(this, id).apply(initializer)

@Generated
public fun Construct.cfnTokenVault(
  id: String,
  props: CfnTokenVaultProps,
  initializer: @AwsCdkDsl CfnTokenVault.() -> Unit = {},
): CfnTokenVault = CfnTokenVault(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTokenVault(id: String, initializer: @AwsCdkDsl CfnTokenVault.Builder.() -> Unit = {}): CfnTokenVault = CfnTokenVault.Builder.create(this, id).apply(initializer).build()
