package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnHost
import software.amazon.awscdk.services.ec2.CfnHostProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHost(id: String, props: CfnHostProps): CfnHost = CfnHost(this, id, props)

@Generated
public fun Construct.cfnHost(
  id: String,
  props: CfnHostProps,
  initializer: @AwsCdkDsl CfnHost.() -> Unit,
): CfnHost = CfnHost(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHost(id: String, initializer: @AwsCdkDsl CfnHost.Builder.() -> Unit):
    CfnHost = CfnHost.Builder.create(this, id).apply(initializer).build()
