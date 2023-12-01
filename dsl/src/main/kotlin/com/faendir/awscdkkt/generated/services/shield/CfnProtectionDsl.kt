package com.faendir.awscdkkt.generated.services.shield

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.shield.CfnProtection
import software.amazon.awscdk.services.shield.CfnProtectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProtection(
  id: String,
  props: CfnProtectionProps,
  initializer: @AwsCdkDsl CfnProtection.() -> Unit = {},
): CfnProtection = CfnProtection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProtection(id: String, initializer: @AwsCdkDsl
    CfnProtection.Builder.() -> Unit = {}): CfnProtection = CfnProtection.Builder.create(this,
    id).apply(initializer).build()
