package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.AccessKey
import software.amazon.awscdk.services.iam.AccessKeyProps
import software.constructs.Construct

@Generated
public fun Construct.accessKey(
  id: String,
  props: AccessKeyProps,
  initializer: @AwsCdkDsl AccessKey.() -> Unit = {},
): AccessKey = AccessKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAccessKey(id: String, initializer: @AwsCdkDsl AccessKey.Builder.() -> Unit
    = {}): AccessKey = AccessKey.Builder.create(this, id).apply(initializer).build()
