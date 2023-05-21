package com.faendir.awscdkkt.customresources

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.customresources.AwsCustomResource
import software.amazon.awscdk.customresources.AwsCustomResourceProps
import software.constructs.Construct

@Generated
public fun Construct.awsCustomResource(
  id: String,
  props: AwsCustomResourceProps,
  initializer: AwsCustomResource.() -> Unit = {},
): AwsCustomResource = AwsCustomResource(this, id, props).apply(initializer)
