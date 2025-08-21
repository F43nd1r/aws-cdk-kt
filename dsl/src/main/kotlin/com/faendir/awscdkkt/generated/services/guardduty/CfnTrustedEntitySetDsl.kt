package com.faendir.awscdkkt.generated.services.guardduty

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnTrustedEntitySet
import software.amazon.awscdk.services.guardduty.CfnTrustedEntitySetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrustedEntitySet(
  id: String,
  props: CfnTrustedEntitySetProps,
  initializer: @AwsCdkDsl CfnTrustedEntitySet.() -> Unit = {},
): CfnTrustedEntitySet = CfnTrustedEntitySet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrustedEntitySet(id: String, initializer: @AwsCdkDsl CfnTrustedEntitySet.Builder.() -> Unit = {}): CfnTrustedEntitySet = CfnTrustedEntitySet.Builder.create(this, id).apply(initializer).build()
