package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Resource
import software.amazon.awscdk.services.apigateway.ResourceProps
import software.constructs.Construct

@Generated
public fun Construct.resource(id: String, props: ResourceProps): Resource = Resource(this, id,
    props)

@Generated
public fun Construct.resource(
  id: String,
  props: ResourceProps,
  initializer: @AwsCdkDsl Resource.() -> Unit,
): Resource = Resource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildResource(id: String, initializer: @AwsCdkDsl Resource.Builder.() -> Unit):
    Resource = Resource.Builder.create(this, id).apply(initializer).build()
