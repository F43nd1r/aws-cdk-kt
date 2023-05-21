@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.s3.deployment

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata

@Deprecated(message =
    "software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata is deprecated in CDK.")
@Generated
public fun userDefinedObjectMetadata(initializer: UserDefinedObjectMetadata.Builder.() -> Unit =
    {}): UserDefinedObjectMetadata = UserDefinedObjectMetadata.builder().apply(initializer).build()
