package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.MultipartUserData

@Generated
public fun buildMultipartUserData(initializer: @AwsCdkDsl MultipartUserData.Builder.() -> Unit =
    {}): MultipartUserData = MultipartUserData.Builder.create().apply(initializer).build()
