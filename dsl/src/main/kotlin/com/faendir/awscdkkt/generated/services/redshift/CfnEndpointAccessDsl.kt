package com.faendir.awscdkkt.generated.services.redshift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnEndpointAccess
import software.amazon.awscdk.services.redshift.CfnEndpointAccessProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEndpointAccess(
  id: String,
  props: CfnEndpointAccessProps,
  initializer: @AwsCdkDsl CfnEndpointAccess.() -> Unit = {},
): CfnEndpointAccess = CfnEndpointAccess(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEndpointAccess(id: String, initializer: @AwsCdkDsl
    CfnEndpointAccess.Builder.() -> Unit = {}): CfnEndpointAccess =
    CfnEndpointAccess.Builder.create(this, id).apply(initializer).build()
