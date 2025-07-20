package com.faendir.awscdkkt.generated.services.waf

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnXssMatchSet
import software.amazon.awscdk.services.waf.CfnXssMatchSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnXssMatchSet(
  id: String,
  props: CfnXssMatchSetProps,
  initializer: @AwsCdkDsl CfnXssMatchSet.() -> Unit = {},
): CfnXssMatchSet = CfnXssMatchSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnXssMatchSet(id: String, initializer: @AwsCdkDsl CfnXssMatchSet.Builder.() -> Unit = {}): CfnXssMatchSet = CfnXssMatchSet.Builder.create(this, id).apply(initializer).build()
