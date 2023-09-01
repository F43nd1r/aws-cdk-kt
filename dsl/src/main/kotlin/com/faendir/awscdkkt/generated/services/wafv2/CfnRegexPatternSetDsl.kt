package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSet
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRegexPatternSet(
  id: String,
  props: CfnRegexPatternSetProps,
  initializer: @AwsCdkDsl CfnRegexPatternSet.() -> Unit = {},
): CfnRegexPatternSet = CfnRegexPatternSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRegexPatternSet(id: String, initializer: @AwsCdkDsl
    CfnRegexPatternSet.Builder.() -> Unit = {}): CfnRegexPatternSet =
    CfnRegexPatternSet.Builder.create(this, id).apply(initializer).build()
