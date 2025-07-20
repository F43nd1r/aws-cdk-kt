package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnGroupVersion
import software.amazon.awscdk.services.greengrass.CfnGroupVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGroupVersion(
  id: String,
  props: CfnGroupVersionProps,
  initializer: @AwsCdkDsl CfnGroupVersion.() -> Unit = {},
): CfnGroupVersion = CfnGroupVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGroupVersion(id: String, initializer: @AwsCdkDsl CfnGroupVersion.Builder.() -> Unit = {}): CfnGroupVersion = CfnGroupVersion.Builder.create(this, id).apply(initializer).build()
