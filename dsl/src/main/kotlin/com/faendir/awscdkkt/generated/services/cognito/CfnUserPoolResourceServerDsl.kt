package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolResourceServer(id: String, props: CfnUserPoolResourceServerProps):
    CfnUserPoolResourceServer = CfnUserPoolResourceServer(this, id, props)

@Generated
public fun Construct.cfnUserPoolResourceServer(
  id: String,
  props: CfnUserPoolResourceServerProps,
  initializer: @AwsCdkDsl CfnUserPoolResourceServer.() -> Unit,
): CfnUserPoolResourceServer = CfnUserPoolResourceServer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolResourceServer(id: String, initializer: @AwsCdkDsl
    CfnUserPoolResourceServer.Builder.() -> Unit): CfnUserPoolResourceServer =
    CfnUserPoolResourceServer.Builder.create(this, id).apply(initializer).build()
