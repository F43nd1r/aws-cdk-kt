package com.faendir.awscdkkt.generated.services.proton

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection
import software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEnvironmentAccountConnection(id: String, initializer: @AwsCdkDsl CfnEnvironmentAccountConnection.() -> Unit = {}): CfnEnvironmentAccountConnection = CfnEnvironmentAccountConnection(this, id).apply(initializer)

@Generated
public fun Construct.cfnEnvironmentAccountConnection(
  id: String,
  props: CfnEnvironmentAccountConnectionProps,
  initializer: @AwsCdkDsl CfnEnvironmentAccountConnection.() -> Unit = {},
): CfnEnvironmentAccountConnection = CfnEnvironmentAccountConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEnvironmentAccountConnection(id: String, initializer: @AwsCdkDsl CfnEnvironmentAccountConnection.Builder.() -> Unit = {}): CfnEnvironmentAccountConnection = CfnEnvironmentAccountConnection.Builder.create(this, id).apply(initializer).build()
