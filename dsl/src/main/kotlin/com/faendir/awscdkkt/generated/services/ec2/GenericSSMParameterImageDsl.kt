package com.faendir.awscdkkt.generated.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.services.ec2.GenericSSMParameterImage
import software.amazon.awscdk.services.ec2.OperatingSystemType
import software.amazon.awscdk.services.ec2.UserData

@Generated
public fun genericSSMParameterImage(parameterName: String, os: OperatingSystemType):
    GenericSSMParameterImage = GenericSSMParameterImage(parameterName, os)

@Generated
public fun genericSSMParameterImage(
  parameterName: String,
  os: OperatingSystemType,
  userData: UserData,
): GenericSSMParameterImage = GenericSSMParameterImage(parameterName, os, userData)
