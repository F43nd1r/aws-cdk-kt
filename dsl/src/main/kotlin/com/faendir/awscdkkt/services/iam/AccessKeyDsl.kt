package com.faendir.awscdkkt.services.iam

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
  initializer: AccessKey.() -> Unit = {},
): AccessKey = AccessKey(this, id, props).apply(initializer)
