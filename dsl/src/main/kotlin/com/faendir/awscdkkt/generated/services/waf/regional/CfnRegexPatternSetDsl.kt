package com.faendir.awscdkkt.generated.services.waf.regional

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps
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
