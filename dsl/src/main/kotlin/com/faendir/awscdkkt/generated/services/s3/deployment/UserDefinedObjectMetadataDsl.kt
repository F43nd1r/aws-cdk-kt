@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.s3.deployment

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata

@Deprecated(message =
    "software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata is deprecated in CDK.")
@Generated
public fun buildUserDefinedObjectMetadata(initializer: @AwsCdkDsl
    UserDefinedObjectMetadata.Builder.() -> Unit): UserDefinedObjectMetadata =
    UserDefinedObjectMetadata.Builder().apply(initializer).build()
