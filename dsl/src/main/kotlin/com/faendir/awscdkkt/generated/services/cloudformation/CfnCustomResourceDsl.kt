package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnCustomResource
import software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomResource(id: String, props: CfnCustomResourceProps): CfnCustomResource
    = CfnCustomResource(this, id, props)

@Generated
public fun Construct.cfnCustomResource(
  id: String,
  props: CfnCustomResourceProps,
  initializer: @AwsCdkDsl CfnCustomResource.() -> Unit,
): CfnCustomResource = CfnCustomResource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomResource(id: String, initializer: @AwsCdkDsl
    CfnCustomResource.Builder.() -> Unit): CfnCustomResource =
    CfnCustomResource.Builder.create(this, id).apply(initializer).build()
