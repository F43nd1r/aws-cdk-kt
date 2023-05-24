package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.StringParameter
import software.amazon.awscdk.services.ssm.StringParameterProps
import software.constructs.Construct

@Generated
public fun Construct.stringParameter(id: String, props: StringParameterProps): StringParameter =
    StringParameter(this, id, props)

@Generated
public fun Construct.stringParameter(
  id: String,
  props: StringParameterProps,
  initializer: @AwsCdkDsl StringParameter.() -> Unit,
): StringParameter = StringParameter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStringParameter(id: String, initializer: @AwsCdkDsl
    StringParameter.Builder.() -> Unit): StringParameter = StringParameter.Builder.create(this,
    id).apply(initializer).build()
