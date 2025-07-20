package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBProxy
import software.amazon.awscdk.services.rds.CfnDBProxyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBProxy(
  id: String,
  props: CfnDBProxyProps,
  initializer: @AwsCdkDsl CfnDBProxy.() -> Unit = {},
): CfnDBProxy = CfnDBProxy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBProxy(id: String, initializer: @AwsCdkDsl CfnDBProxy.Builder.() -> Unit = {}): CfnDBProxy = CfnDBProxy.Builder.create(this, id).apply(initializer).build()
