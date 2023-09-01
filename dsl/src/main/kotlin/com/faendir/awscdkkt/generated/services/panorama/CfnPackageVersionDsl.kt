package com.faendir.awscdkkt.generated.services.panorama

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnPackageVersion
import software.amazon.awscdk.services.panorama.CfnPackageVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPackageVersion(
  id: String,
  props: CfnPackageVersionProps,
  initializer: @AwsCdkDsl CfnPackageVersion.() -> Unit = {},
): CfnPackageVersion = CfnPackageVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPackageVersion(id: String, initializer: @AwsCdkDsl
    CfnPackageVersion.Builder.() -> Unit = {}): CfnPackageVersion =
    CfnPackageVersion.Builder.create(this, id).apply(initializer).build()
