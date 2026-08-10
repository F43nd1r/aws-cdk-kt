package com.faendir.awscdkkt.generated.services.smsvoice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.smsvoice.CfnRegistration
import software.amazon.awscdk.services.smsvoice.CfnRegistrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRegistration(
  id: String,
  props: CfnRegistrationProps,
  initializer: @AwsCdkDsl CfnRegistration.() -> Unit = {},
): CfnRegistration = CfnRegistration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRegistration(id: String, initializer: @AwsCdkDsl CfnRegistration.Builder.() -> Unit = {}): CfnRegistration = CfnRegistration.Builder.create(this, id).apply(initializer).build()
