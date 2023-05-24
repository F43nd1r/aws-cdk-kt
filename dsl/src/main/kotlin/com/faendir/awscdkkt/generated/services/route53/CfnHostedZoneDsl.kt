package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHostedZone
import software.amazon.awscdk.services.route53.CfnHostedZoneProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHostedZone(id: String, props: CfnHostedZoneProps): CfnHostedZone =
    CfnHostedZone(this, id, props)

@Generated
public fun Construct.cfnHostedZone(
  id: String,
  props: CfnHostedZoneProps,
  initializer: @AwsCdkDsl CfnHostedZone.() -> Unit,
): CfnHostedZone = CfnHostedZone(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnHostedZone(id: String): CfnHostedZone = CfnHostedZone(this, id)

@Generated
public fun Construct.cfnHostedZone(id: String, initializer: @AwsCdkDsl CfnHostedZone.() -> Unit):
    CfnHostedZone = CfnHostedZone(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnHostedZone(id: String, initializer: @AwsCdkDsl
    CfnHostedZone.Builder.() -> Unit): CfnHostedZone = CfnHostedZone.Builder.create(this,
    id).apply(initializer).build()
