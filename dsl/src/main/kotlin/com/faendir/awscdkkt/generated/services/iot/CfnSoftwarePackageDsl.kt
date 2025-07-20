package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSoftwarePackage
import software.amazon.awscdk.services.iot.CfnSoftwarePackageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSoftwarePackage(id: String, initializer: @AwsCdkDsl CfnSoftwarePackage.() -> Unit = {}): CfnSoftwarePackage = CfnSoftwarePackage(this, id).apply(initializer)

@Generated
public fun Construct.cfnSoftwarePackage(
  id: String,
  props: CfnSoftwarePackageProps,
  initializer: @AwsCdkDsl CfnSoftwarePackage.() -> Unit = {},
): CfnSoftwarePackage = CfnSoftwarePackage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSoftwarePackage(id: String, initializer: @AwsCdkDsl CfnSoftwarePackage.Builder.() -> Unit = {}): CfnSoftwarePackage = CfnSoftwarePackage.Builder.create(this, id).apply(initializer).build()
