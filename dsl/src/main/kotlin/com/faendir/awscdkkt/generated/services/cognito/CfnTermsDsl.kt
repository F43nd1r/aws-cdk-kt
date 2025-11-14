package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnTerms
import software.amazon.awscdk.services.cognito.CfnTermsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTerms(
  id: String,
  props: CfnTermsProps,
  initializer: @AwsCdkDsl CfnTerms.() -> Unit = {},
): CfnTerms = CfnTerms(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTerms(id: String, initializer: @AwsCdkDsl CfnTerms.Builder.() -> Unit = {}): CfnTerms = CfnTerms.Builder.create(this, id).apply(initializer).build()
