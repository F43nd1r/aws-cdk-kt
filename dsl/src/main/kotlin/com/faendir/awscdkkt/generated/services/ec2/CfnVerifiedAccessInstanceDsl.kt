package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVerifiedAccessInstance(id: String, initializer: @AwsCdkDsl CfnVerifiedAccessInstance.() -> Unit = {}): CfnVerifiedAccessInstance = CfnVerifiedAccessInstance(this, id).apply(initializer)

@Generated
public fun Construct.cfnVerifiedAccessInstance(
  id: String,
  props: CfnVerifiedAccessInstanceProps,
  initializer: @AwsCdkDsl CfnVerifiedAccessInstance.() -> Unit = {},
): CfnVerifiedAccessInstance = CfnVerifiedAccessInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVerifiedAccessInstance(id: String, initializer: @AwsCdkDsl CfnVerifiedAccessInstance.Builder.() -> Unit = {}): CfnVerifiedAccessInstance = CfnVerifiedAccessInstance.Builder.create(this, id).apply(initializer).build()
