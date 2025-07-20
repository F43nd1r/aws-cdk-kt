package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CustomResource
import software.amazon.awscdk.CustomResourceProps
import software.constructs.Construct

@Generated
public fun Construct.customResource(
  id: String,
  props: CustomResourceProps,
  initializer: @AwsCdkDsl CustomResource.() -> Unit = {},
): CustomResource = CustomResource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCustomResource(id: String, initializer: @AwsCdkDsl CustomResource.Builder.() -> Unit = {}): CustomResource = CustomResource.Builder.create(this, id).apply(initializer).build()
