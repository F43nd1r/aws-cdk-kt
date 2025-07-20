package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion
import software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSoftwarePackageVersion(
  id: String,
  props: CfnSoftwarePackageVersionProps,
  initializer: @AwsCdkDsl CfnSoftwarePackageVersion.() -> Unit = {},
): CfnSoftwarePackageVersion = CfnSoftwarePackageVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSoftwarePackageVersion(id: String, initializer: @AwsCdkDsl CfnSoftwarePackageVersion.Builder.() -> Unit = {}): CfnSoftwarePackageVersion = CfnSoftwarePackageVersion.Builder.create(this, id).apply(initializer).build()
