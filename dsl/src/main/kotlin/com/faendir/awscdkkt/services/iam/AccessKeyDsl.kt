@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.AccessKey
import software.amazon.awscdk.services.iam.AccessKeyProps
import software.constructs.Construct

public fun Construct.accessKey(
  id: String,
  props: AccessKeyProps,
  initializer: AccessKey.() -> Unit = {},
): AccessKey = AccessKey(this, id, props).apply(initializer)
