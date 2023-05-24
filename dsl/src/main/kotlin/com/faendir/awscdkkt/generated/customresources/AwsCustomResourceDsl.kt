package com.faendir.awscdkkt.generated.customresources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.customresources.AwsCustomResource
import software.amazon.awscdk.customresources.AwsCustomResourceProps
import software.constructs.Construct

@Generated
public fun Construct.awsCustomResource(id: String, props: AwsCustomResourceProps): AwsCustomResource
    = AwsCustomResource(this, id, props)

@Generated
public fun Construct.awsCustomResource(
  id: String,
  props: AwsCustomResourceProps,
  initializer: @AwsCdkDsl AwsCustomResource.() -> Unit,
): AwsCustomResource = AwsCustomResource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAwsCustomResource(id: String, initializer: @AwsCdkDsl
    AwsCustomResource.Builder.() -> Unit): AwsCustomResource =
    AwsCustomResource.Builder.create(this, id).apply(initializer).build()
