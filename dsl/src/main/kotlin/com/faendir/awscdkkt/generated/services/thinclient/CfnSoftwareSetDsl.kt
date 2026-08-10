package com.faendir.awscdkkt.generated.services.thinclient

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.thinclient.CfnSoftwareSet
import software.amazon.awscdk.services.thinclient.CfnSoftwareSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSoftwareSet(id: String, initializer: @AwsCdkDsl CfnSoftwareSet.() -> Unit = {}): CfnSoftwareSet = CfnSoftwareSet(this, id).apply(initializer)

@Generated
public fun Construct.cfnSoftwareSet(
  id: String,
  props: CfnSoftwareSetProps,
  initializer: @AwsCdkDsl CfnSoftwareSet.() -> Unit = {},
): CfnSoftwareSet = CfnSoftwareSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSoftwareSet(id: String, initializer: @AwsCdkDsl CfnSoftwareSet.Builder.() -> Unit = {}): CfnSoftwareSet = CfnSoftwareSet.Builder.create(this, id).apply(initializer).build()
