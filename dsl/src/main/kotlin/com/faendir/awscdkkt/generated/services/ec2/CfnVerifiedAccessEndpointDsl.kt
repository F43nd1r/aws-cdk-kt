package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVerifiedAccessEndpoint(
  id: String,
  props: CfnVerifiedAccessEndpointProps,
  initializer: @AwsCdkDsl CfnVerifiedAccessEndpoint.() -> Unit = {},
): CfnVerifiedAccessEndpoint = CfnVerifiedAccessEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVerifiedAccessEndpoint(id: String, initializer: @AwsCdkDsl CfnVerifiedAccessEndpoint.Builder.() -> Unit = {}): CfnVerifiedAccessEndpoint = CfnVerifiedAccessEndpoint.Builder.create(this, id).apply(initializer).build()
