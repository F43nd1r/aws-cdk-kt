package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.StringListParameter
import software.amazon.awscdk.services.ssm.StringListParameterProps
import software.constructs.Construct

@Generated
public fun Construct.stringListParameter(
  id: String,
  props: StringListParameterProps,
  initializer: @AwsCdkDsl StringListParameter.() -> Unit = {},
): StringListParameter = StringListParameter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStringListParameter(id: String, initializer: @AwsCdkDsl StringListParameter.Builder.() -> Unit = {}): StringListParameter = StringListParameter.Builder.create(this, id).apply(initializer).build()
