package com.faendir.awscdkkt.generated.services.shield

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.shield.CfnProtectionGroup
import software.amazon.awscdk.services.shield.CfnProtectionGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProtectionGroup(
  id: String,
  props: CfnProtectionGroupProps,
  initializer: @AwsCdkDsl CfnProtectionGroup.() -> Unit = {},
): CfnProtectionGroup = CfnProtectionGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProtectionGroup(id: String, initializer: @AwsCdkDsl
    CfnProtectionGroup.Builder.() -> Unit = {}): CfnProtectionGroup =
    CfnProtectionGroup.Builder.create(this, id).apply(initializer).build()
