package com.faendir.awscdkkt.generated.services.guardduty

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnThreatEntitySet
import software.amazon.awscdk.services.guardduty.CfnThreatEntitySetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnThreatEntitySet(
  id: String,
  props: CfnThreatEntitySetProps,
  initializer: @AwsCdkDsl CfnThreatEntitySet.() -> Unit = {},
): CfnThreatEntitySet = CfnThreatEntitySet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnThreatEntitySet(id: String, initializer: @AwsCdkDsl CfnThreatEntitySet.Builder.() -> Unit = {}): CfnThreatEntitySet = CfnThreatEntitySet.Builder.create(this, id).apply(initializer).build()
