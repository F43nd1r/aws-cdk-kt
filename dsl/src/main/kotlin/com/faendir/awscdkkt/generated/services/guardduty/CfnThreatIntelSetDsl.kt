package com.faendir.awscdkkt.generated.services.guardduty

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnThreatIntelSet
import software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnThreatIntelSet(
  id: String,
  props: CfnThreatIntelSetProps,
  initializer: @AwsCdkDsl CfnThreatIntelSet.() -> Unit = {},
): CfnThreatIntelSet = CfnThreatIntelSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnThreatIntelSet(id: String, initializer: @AwsCdkDsl
    CfnThreatIntelSet.Builder.() -> Unit = {}): CfnThreatIntelSet =
    CfnThreatIntelSet.Builder.create(this, id).apply(initializer).build()
