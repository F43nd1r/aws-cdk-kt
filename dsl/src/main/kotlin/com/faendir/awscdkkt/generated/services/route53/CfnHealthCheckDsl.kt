package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.amazon.awscdk.services.route53.CfnHealthCheckProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHealthCheck(id: String, props: CfnHealthCheckProps): CfnHealthCheck =
    CfnHealthCheck(this, id, props)

@Generated
public fun Construct.cfnHealthCheck(
  id: String,
  props: CfnHealthCheckProps,
  initializer: @AwsCdkDsl CfnHealthCheck.() -> Unit,
): CfnHealthCheck = CfnHealthCheck(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHealthCheck(id: String, initializer: @AwsCdkDsl
    CfnHealthCheck.Builder.() -> Unit): CfnHealthCheck = CfnHealthCheck.Builder.create(this,
    id).apply(initializer).build()
