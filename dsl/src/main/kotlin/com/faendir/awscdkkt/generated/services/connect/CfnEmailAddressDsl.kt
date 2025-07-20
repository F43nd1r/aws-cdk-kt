package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnEmailAddress
import software.amazon.awscdk.services.connect.CfnEmailAddressProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEmailAddress(
  id: String,
  props: CfnEmailAddressProps,
  initializer: @AwsCdkDsl CfnEmailAddress.() -> Unit = {},
): CfnEmailAddress = CfnEmailAddress(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEmailAddress(id: String, initializer: @AwsCdkDsl CfnEmailAddress.Builder.() -> Unit = {}): CfnEmailAddress = CfnEmailAddress.Builder.create(this, id).apply(initializer).build()
