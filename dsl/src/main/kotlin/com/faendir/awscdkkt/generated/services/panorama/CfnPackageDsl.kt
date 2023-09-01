package com.faendir.awscdkkt.generated.services.panorama

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnPackage
import software.amazon.awscdk.services.panorama.CfnPackageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPackage(
  id: String,
  props: CfnPackageProps,
  initializer: @AwsCdkDsl CfnPackage.() -> Unit = {},
): CfnPackage = CfnPackage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPackage(id: String, initializer: @AwsCdkDsl
    CfnPackage.Builder.() -> Unit = {}): CfnPackage = CfnPackage.Builder.create(this,
    id).apply(initializer).build()
