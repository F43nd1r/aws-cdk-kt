package com.faendir.awscdkkt.generated.services.devicefarm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnUpload
import software.amazon.awscdk.services.devicefarm.CfnUploadProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUpload(
  id: String,
  props: CfnUploadProps,
  initializer: @AwsCdkDsl CfnUpload.() -> Unit = {},
): CfnUpload = CfnUpload(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUpload(id: String, initializer: @AwsCdkDsl CfnUpload.Builder.() -> Unit = {}): CfnUpload = CfnUpload.Builder.create(this, id).apply(initializer).build()
